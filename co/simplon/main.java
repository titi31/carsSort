package co.simplon;
import java.util.ArrayList;

class Main {
    private static ArrayList<Cars> tab=new ArrayList<Cars>();
    


    public static void main(String[] args) {
        tab.add(new Cars("car","BMW", "blue"));
        tab.add(new Cars("car", "BMW", "red"));
        tab.add(new Cars("car", "BMW 2", "blue"));
        tab.add(new Cars("truck","MERCEDES","blue"));
        tab.add(new Cars("truck", "MERCEDES", "red"));
        tab.add(new Cars( "truck", "MERCEDES","green"));
        tab.add(new Cars("truck","HYUNDAI", "Blue"));
        tab.add(new Cars("boat","yachts","Blue"));
        tab.add(new Cars("boat", "yachts", "Blue"));
        tab.add(new Cars("boat", "yachts","yellow"));
       
         trie(tab);

      
    }
    public static void trie(ArrayList<Cars> tab){
        while(tab.size()>0){
         String cat=tab.get(0).getCategoryName();
        String color=tab.get(0).getColor();
        ArrayList<String> tabCat=new ArrayList<String>();
        ArrayList<Cars> num=new ArrayList<Cars>();
        for(int car=0;car<tab.size();car++){
           if(cat.contentEquals(tab.get(car).getCategoryName()) && color.contentEquals(tab.get(car).getColor())){
                tabCat.add(tab.get(car).getName());
                System.out.println(car);
                num.add(tab.get(car));
               
               
           }
           
        }
        for(int i=0;i<num.size();i++){
         
         tab.remove(tab.indexOf(num.get(i)));

        }
      
        System.out.println("Les voitures de categorie "+cat+" et de couleur "+color+" sont : "+tabCat);
       
    }
    }
}