package ie.atu.productv5;

import ie.atu.productv5.Book;
import ie.atu.productv5.Music;
import ie.atu.productv5.Tv;
public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or datamyBookase
        // For now, this code just uses if/else statements
        // to return the correct product data


        Product myProduct = null;
        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct=mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct=mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct=mySoftware;
        }
        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct=myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myProduct=myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct=myBook;
        }
        if (productCode.equalsIgnoreCase("LT55")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("Smart 4k Ultra HD HDR LED");
            myTv.setPrice(399.00);
            myTv.setScreenSize("55inch");
            myTv.setManufacturer("JVC");
            myProduct=myTv;
        } else if (productCode.equalsIgnoreCase("SAMSUNG")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("Smart 4K Ultra HD HDR LED TV");
            myTv.setPrice(529.00);
            myTv.setScreenSize("55inch");
            myTv.setManufacturer("SAMSUNG");
            myProduct=myTv;
        }
        if (productCode.equalsIgnoreCase("Thriller")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Thriller");
            myMusic.setPrice(39.19);
            myMusic.setArtist("Michael Jackson");
            myMusic.setLabel("Epic");
            myProduct=myMusic;
        } else if (productCode.equalsIgnoreCase("21")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("21");
            myMusic.setPrice(28.95);
            myMusic.setArtist("Adele");
            myMusic.setLabel("Columbia");
            myProduct=myMusic;
        }

        return myProduct;
    }
}
