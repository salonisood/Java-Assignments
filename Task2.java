class Musician

{
String name;
String band_name;
int no_of_songs;
int no_of_concerts;
String country;


Musician (String name,String band_name,int no_of_songs,int no_of_concerts,String country) 

    { this.name= name; 
      this.band_name= band_name; 
      this.no_of_songs= no_of_songs; 
      this.no_of_concerts= no_of_concerts; 
      this.country= country; 
    }

 public static void main (String [] args)
    {
     Musician c= new Musician ("David","Pink Floyd",29,12,"UK");
     System.out.println("The name of the musician is " +c.name);
     System.out.println("The name of his band is " +c.band_name);
     System.out.println("The number of songs he has recorded till now is " +c.no_of_songs);
     System.out.println("The total number of concerts he has performed is " +c.no_of_concerts);
     System.out.println("He is from " +c.country);
    
    }
   

}
