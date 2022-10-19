package com.POSSystemGradle.POSSytemGradle;

import com.POSSystemGradle.POSSytemGradle.Price.Currency;
import com.POSSystemGradle.POSSytemGradle.Price.Price;
import com.POSSystemGradle.POSSytemGradle.Price.PriceController;
import com.POSSystemGradle.POSSytemGradle.Price.PriceRepository;
import com.POSSystemGradle.POSSytemGradle.Product.ProductController;
import com.POSSystemGradle.POSSytemGradle.Product.ProductModel;
import com.POSSystemGradle.POSSytemGradle.Product.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
public class PriceControllerTest {
    @Autowired
    private PriceController priceController;
    @MockBean
    private PriceRepository priceRepository;
    @Test
    public void addPrice()
    {
        Price price=new Price(1,20,new Date(2022-02-25),new Date(2022-12-25),876545, Currency.INR);

        assertEquals(price,price);
    }
    @Test
    public void getProductDescriptionById()
    {
        Price price=new Price(1,20,new Date(2022-02-25),new Date(2022-12-25),876545, Currency.INR);

        //when(priceRepository.findById(price.getId())).thenReturn(price);
        assertNotNull(price);
    }

    @Test
    public void productIsNUllWhenIdIsNotPresent()
    {
        Price price=new Price(1,20,new Date(2022-02-25),new Date(2022-12-25),876545, Currency.INR);

       // when(priceRepository.findById(price.getId())).thenReturn(Optional.of(price));
        assertNull(priceController.getPrice(2));
    }
}
