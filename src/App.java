public class App {
    public static void main(String[] args) throws Exception {
        
        Libro libro1 = new Libro("Gabriel Garcia Marquez", "Cien Años De Soledad");
        Lector lector1 = new Lector ("Mateo", "1033724296");

    
        Libro libro2 = new Libro("Mateo Giraldo", "Tatareto Y Mudo");
        Lector lector2= new Lector ("Brayan", "1033724296");

      
         
        Libro libro3 = new Libro("Jose Manuel", "Principito");
        Lector lector3 = new Lector ("Michael", "1033724296");

    

         
        Libro libro4 = new Libro("Manuel Jose", "El dinero en abundancia");
        Lector lector4 = new Lector ("Jackson", "1033724296");

        
         
        Libro libro5 = new Libro("Messi", "Como ser Dios");
        Lector lector5 = new Lector ("Restrepo", "1033724296");

        lector1.tomarPrestado(libro1);
        lector1.mostrarEstado();
        lector2.tomarPrestado(libro1);
        lector1.regresarLibro();
        lector2.tomarPrestado(libro1);


        lector3.tomarPrestado(libro2);
        lector3.mostrarEstado();
        lector4.tomarPrestado(libro2);
        lector3.regresarLibro();
        lector4.tomarPrestado(libro2);

        lector5.tomarPrestado(libro2);
        lector4.regresarLibro();
        lector5.tomarPrestado(libro2);


        

    }
}
