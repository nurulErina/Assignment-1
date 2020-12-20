
package assignementskincare;

public class AssignementSkincare {

    public static void main(String[] args) {
        
        CategorySkincare c = new CategorySkincare("\ncleansing","\nmoisturing","\nserum","\ntoner");
        BrandsSkincare b = new BrandsSkincare("Safi","Loreal","Simple","Himalaya","Biore");
        System.out.println("Brands skincare type: "+c.toString());
        
        b.setString("pack 1","pack 2","pack 3","pack 4","pack 5");
        System.out.println("First brand skincare Safi: "+b.getStringOne());
        System.out.println("Second brand skincare Loreal: "+b.getStringTwo());
        System.out.println("Third brand skincare Simple: "+b.getStringThree());
        System.out.println("Fourth brand skincare Himalaya: "+b.getStringFour());
        System.out.println("Fifth brand skincare Biore: "+b.getStringFive());
    }
    
}
