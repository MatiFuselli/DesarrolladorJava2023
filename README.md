# DesarrolladorJava2023

/*
A) PARA MOSTRAR UNA SECUENCIA DEL 5 AL 14 
*/

          int numeroinicial = 5, numerofinal = 14;
           while (numeroinicial <= numerofinal) {	
                       System.out.print ("-"+ numeroinicial);
                        numeroinicial=numeroinicial+1;
            }
 }

/*
 B) PARA MOSTRAR LOS NÚMEROS PARES
 */

             int numeroinicial = 5, numerofinal = 14;
             while (numeroinicial<=numerofinal) {
	         if (numeroinicial%2 == 0) {
                	              System.out.print("- " + numeroinicial);
	          } //cierre del if
                              numeroinicial=numeroinicial+1;
                } //cierre del while

/*
C) Respuesta al punto C
*/

 int numeroinicial = 5, numerofinal = 14;

 boolean imprimirPares = true;

	while (numeroinicial<=numerofinal) {
		
		if (imprimirPares == true) {
		
		if (numeroinicial%2 == 0) {
			
			System.out.print("- " + numeroinicial);		
		} //cierre del if	
		}else{
			if (numeroinicial%2 != 0) {		
				System.out.print("- " + numeroinicial);	
			}
		}
		
		
	
		numeroinicial=numeroinicial+1;	
	} //cierre del while
 }
	
	}

/*
D) Usando la sentencia FOR
/

             int numeroInicial = 5;
            for(int numeroFinal=14; numeroFinal>=numeroInicial;numeroFinal--) {  

                     System.out.print(" -"+ numeroFinal);				
            }


/* 
EJERCICIO 2

A) Categoría de la docente 
*/


 float ingresos = 500000;
 int superficie = 0;
 int energia = 330;

 if ((ingresos <= 748382.07) && (superficie <= 30) && (energia <= 3330) ) {
 	System.out.println("Categoria A");
 } else if ((ingresos <= 1112459.83) && (superficie <= 45) && (energia <= 5000) ) {
         System.out.println("Categoria B");

/*
Resultado: la docente pertenece a la categoría A

B) Categoría del carpintero
*/

float ingresos = 1000000;
int superficie = 30;
int energia = 10000;

if ((ingresos <= 748382.07) && (superficie <= 30) && (energia <= 3330) ) {
	System.out.println("Categoria A");
} else if ((ingresos <= 1112459.83) && (superficie <= 45) && (energia <= 5000) ) {
          System.out.println("Categoria B");
} else if ((ingresos <= 1557443.75) && (superficie <= 60) && (energia <= 6700) ) {
	System.out.println("Categoria C");
	
} else if ((ingresos <= 1934273.04) && (superficie <= 85) && (energia <= 10000) ) {
	System.out.println("Categoria D");
	
} else if ((ingresos <= 2277684.56) && (superficie <= 110) && (energia <= 13000) ) {
	System.out.println("Categoria E");
}
}
}

/* 
Resultado: el carpintero pertenece a la categoría D

C) Categoría del vendedor 
*/

float ingresos = 1112460;
int superficie = 0;
int energia = 0;

if ((ingresos <= 748382.07) && (superficie <= 30) && (energia <= 3330) ) {
	System.out.println("Categoria A");
} else if ((ingresos <= 1112459.83) && (superficie <= 45) && (energia <= 5000) ) {
          System.out.println("Categoria B");
} else if ((ingresos <= 1557443.75) && (superficie <= 60) && (energia <= 6700) ) {
	System.out.println("Categoria C");
	
} else if ((ingresos <= 1934273.04) && (superficie <= 85) && (energia <= 10000) ) {
	System.out.println("Categoria D");
	
} else if ((ingresos <= 2277684.56) && (superficie <= 110) && (energia <= 13000) ) {
	System.out.println("Categoria E");
}
}
}

// Resultado: el vendedor pertenece a la categoría C
