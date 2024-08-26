
package product;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class ProductManagerTest {
    private ProductManager productManager;

    @Before
    public void setUp() {
        
        productManager = new ProductManager();
    }

    @Test
    public void testProductSaved() {
        productManager.saveProduct("P001", "Product1", 15);
        ArrayList<Product> products = productManager.getProducts();
        assertEquals("P001", products.get(0).getProductId());
        assertEquals("Product1", products.get(0).getProductName());
        assertEquals(15, products.get(0).getProductQuantity());
    }

    @Test
    public void testProductSearch() {
        productManager.saveProduct("P001", "Product1", 15);    
        Product foundProduct = productManager.searchProduct("P001");
        assertEquals("P001", foundProduct.getProductId());
        assertEquals("Product1", foundProduct.getProductName());
        assertEquals(15, foundProduct.getProductQuantity());
    }

    @Test
    public void testProductNotFound() {
    Product foundProduct = productManager.searchProduct("P999");
    assertNull(foundProduct);
    }

    
}

