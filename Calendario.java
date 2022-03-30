package entregables;

import java.util.Scanner;

public class Calendario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner teclado = new Scanner(System.in);
		 
		 //AÑO
		 
		 int año = 0;
		 
		 do {System.out.println("Ingrese el año (entre 1900 y 2099): ");
			 año = teclado.nextInt(); 
			 if (año >= 1900 && año <= 2099) {
			 
			} else {System.out.println("El año ingresado es inválido.");
			}
			} while (año < 1900 || año > 2099);
		 
		 //MES
		 
		 int mes = 0;
		 
		 do {System.out.println("Ingrese el mes (entre 1 y 12): ");
			 mes = teclado.nextInt(); 
			 if (mes >= 1 && mes <= 12) {
			 
			} else {System.out.println("El mes ingresado es inválido.");
			}
			} while (mes < 1 || mes > 12);
		 
		 //DÍA
		 
		 int bisiesto = 0;
		 int dia = 0; 
		 
		 //ciclo para determinar el año bisiesto
		 
		 do {bisiesto+= 4;
			
		} while (bisiesto < 200 && año != 1900 + bisiesto);
		 
		 //condicional para determinar si es año bisiesto
		 
		 if (bisiesto < 200) { 
			 
			 //Año bisiesto
			 
			 if (mes == 2) {
				 
				 //febrero en año bisiesto
				 
				 do {System.out.println("Ingrese el dia (entre 1 y 29): ");
				 dia = teclado.nextInt(); 
				 if (dia >= 1 && dia <= 29) {
				 
				} else {System.out.println("El dia ingresado es inválido.");
				}
				} while (dia < 1 || dia > 29);
				
			}
			 
			 //meses de 30 días
			 
			 else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				 
				 do {System.out.println("Ingrese el dia (entre 1 y 30): ");
				 dia = teclado.nextInt(); 
				 if (dia >= 1 && dia <= 30) {
				 
				} else {System.out.println("El dia ingresado es inválido.");
				}
				} while (dia < 1 || dia > 30); 
				
			}
		
			 //meses de 31 días
			 
			 else {
				
				 do {System.out.println("Ingrese el dia (entre 1 y 31): ");
				 dia = teclado.nextInt(); 
				 if (dia >= 1 && dia <= 31) {
				 
				} else {System.out.println("El dia ingresado es inválido.");
				}
				} while (dia < 1 || dia > 31);
			}
			 
			 //FIN AÑO BISIESTO RESUELTO
			 
		} else {
			
 if (mes == 2) {
				 
				 //febrero en año normal
				 
				 do {System.out.println("Ingrese el dia (entre 1 y 28): ");
				 dia = teclado.nextInt(); 
				 if (dia >= 1 && dia <= 28) {
				 
				} else {System.out.println("El dia ingresado es inválido.");
				}
				} while (dia < 1 || dia > 28);
				
			}
			 
			 //meses de 30 días
			 
			 else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				 
				 do {System.out.println("Ingrese el dia (entre 1 y 30): ");
				 dia = teclado.nextInt(); 
				 if (dia >= 1 && dia <= 30) {
				 
				} else {System.out.println("El dia ingresado es inválido.");
				}
				} while (dia < 1 || dia > 30); 
				
			}
		
			 //meses de 31 días
			 
			 else {
				
				 do {System.out.println("Ingrese el dia (entre 1 y 31): ");
				 dia = teclado.nextInt(); 
				 if (dia >= 1 && dia <= 31) {
				 
				} else {System.out.println("El dia ingresado es inválido.");
				}
				} while (dia < 1 || dia > 31);
			}
		}
		 
		 System.out.println("la fecha ingresada es: " + dia + "/" + mes + "/" + año);
		 
		 teclado.close();
		
	}

}



		
	


