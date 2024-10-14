public class Thingamabob {

        //naming
         public Items book;
         public Items ring;
         public Items plant;
         public Items tissue;
         public Items letter;
        //contruct
         public Thingamabob(){
             book = new Items("Botanical Banes and Brews", "This book contains extensive knowledge on plants, especially about poisonous or harmful ones.", 6);
             //prompt if inteacted with plant --> you should go back to the sun room cuz you say Lactuna Sativia in there!
             //prompt if not interacted with plant --> you know Grammy had a plant room, maybe go look at it just in case
             ring = new Items("Grammy's Ring", "This is a beautiful, one-of-a-kind diamond ring, priced at only half a million dollars. Which is well worth the price for one's true love.", 3);
             //called at begining of the game
             plant = new Items("Lactuna sativia", "A plant with rich purple flowers blooming throughout its stem, but the beauty is hiding something worth investigating.", 1);
             letter = new Items("CONFIDENTIAL: DO NOT OPEN", "The envelope of this letter is crumpled and ripped apart but contains the scent of Daisy Mae's beloved perfume.", 1);
             //in main choosen to invesitigate it, if pieced together clearly contains false records or like shes super in debt and needs half a million dollars lol (perfect coincidence that the ring is also that amount)
             tissue = new Items("Trash Tissue", "The tissue contains tear stains and smeared makeup that looks very familiar to Daisy Mae's. Why was she crying?", 1);
             // follow up dialog saying you should probably go ask her (shes in the living room)--> shell brush it off but its obvious she's hiding something, maybe there's something lying around that'll give you some insight
         }
}

     // Obj in whole house {
     // Book1( “name define”, “desc”);
     // Book2( “name define”, “desc”);
     // Book3( “name define”, “desc”);
     //etc…(name, desc)
     // }


