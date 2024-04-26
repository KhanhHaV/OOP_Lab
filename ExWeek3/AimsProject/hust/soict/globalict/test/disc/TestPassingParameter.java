package test.disc;

import aims.media.*;

public class TestPassingParameter{
    public static void main(String[] arg){
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderalla");
        
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: "+jungleDVD.getTitle() );
        System.out.println("cinderella dvd title: "+cinderellaDVD.getTitle() );

        changeTitle(jungleDVD, cinderellaDVD.getTitle() );
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(Object o1, Object o2){
       Object tmp = o1;
       o1 = o2;
       o2 = tmp; 
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.title = title;
        dvd = new DigitalVideoDisc(oldTitle);
    }
}