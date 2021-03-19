package tests;

import org.testng.annotations.Test;
import pages.BaseClass;
import pages.Carousel;

public class CarouselTest extends BaseClass {

    @Test
    public void validationCarousel() {
        Carousel carousel = new Carousel(driver);
        carousel.goTrendyol("Koton");
    }
}
