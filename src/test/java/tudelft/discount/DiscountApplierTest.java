package tudelft.discount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class DiscountApplierTest {

    private ProductDao daoMock;
    private DiscountApplier discountApplier;

    @BeforeEach
    void setUp() {
        // Crear un mock de ProductDao
        daoMock = Mockito.mock(ProductDao.class);
        // Inicializar DiscountApplier con el mock de ProductDao
        discountApplier = new DiscountApplier(daoMock);
    }

    @Test
    void testSetNewPricesBusiness() {
        // Crear un producto de la categoría BUSINESS
        Product product = new Product("Business Product", 100.0, "BUSINESS");

        // Configurar el mock para devolver ese producto
        when(daoMock.all()).thenReturn(Arrays.asList(product));

        // Aplicar los descuentos
        discountApplier.setNewPrices();

        assertEquals(110.0, product.getPrice(), 0.0001);

    }

    @Test
    void testSetNewPricesHome() {
        // Crear un producto de la categoría HOME
        Product product = new Product("Home Product", 100.0, "HOME");

        // Configurar el mock para devolver ese producto
        when(daoMock.all()).thenReturn(Arrays.asList(product));

        // Aplicar los descuentos
        discountApplier.setNewPrices();

        assertEquals(90.0, product.getPrice());
    }

    @Test
    void testSetNewPricesEmpty() {
        // Configurar el mock para devolver una lista vacia
        when(daoMock.all()).thenReturn(Arrays.asList());
        discountApplier.setNewPrices();

        verify(daoMock, times(1)).all();
    }

    @Test
    void testSetNewPricesMultipleProducts() {

        Product businessProduct = new Product("Business Product", 100.0, "BUSINESS");
        Product homeProduct = new Product("Home Product", 100.0, "HOME");

        // Configurar el mock para devolver estos productos
        when(daoMock.all()).thenReturn(Arrays.asList(businessProduct, homeProduct));

        // Aplicar los descuentos
        discountApplier.setNewPrices();

        // Verificar los precios ajustados con un margen de tolerancia (delta)
        assertEquals(110.0, businessProduct.getPrice(), 0.0001);
        assertEquals(90.0, homeProduct.getPrice(), 0.0001);
    }
}
