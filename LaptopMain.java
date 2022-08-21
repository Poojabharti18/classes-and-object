package classandobject;

public class LaptopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Laptop Lenova=new Laptop();
             Lenova.ram=4;
             Lenova.rom=64;
	        Lenova.Processor="i3";
	        Lenova.os="snapdragon";
	        System.out.println("the ram:"+Lenova.ram);
	        System.out.println("the rom:"+Lenova.rom);
	        System.out.println("the processor"+Lenova.Processor);
	        System.out.println("the os:"+Lenova.os);
	       Lenova.communication();
	       Lenova.browsing();
	

}
}
