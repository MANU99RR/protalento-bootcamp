package entregables;

import java.util.Scanner;

public class Calendario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner teclado = new Scanner(System.in);
		 
		 //A�O
		 
		 int a�o = 0;
		 
		 do {System.out.println("Ingrese el a�o (entre 1900 y 2099): ");
			 a�o = teclado.nextInt(); 
			 if (a�o >= 1900 && a�o <= 2099) {
			 
			} else {System.out.println("El a�o ingresado es inv�lido.");
			}
			} while (a�o < 1900 || a�o > 2099);
		 
		 //MES
		 
		 int mes = 0;
		 
		 do {System.out.println("Ingrese el mes (entre 1 y 12): ");
			 mes = teclado.nextInt(); 
			 if (mes >= 1 && mes <= 12) {
			 
			} else {System.out.println("El mes ingresado es inv�lido.");
			}
			} while (mes < 1 || mes > 12);
		 
		 //D�A
		 
		 int bisiesto = 0;
		 int dia = 0; 
		 
		 //ciclo para determinar el a�o bisiesto
		 
		 do {bisiesto+= 4;
			
		} while (bisiesto < 200 && a�o != 1900 + bisiesto);
		 
		 //condicional para determinar si es a�o bisiesto
		 
		 if (bisiesto < 200) { 
			 
			 //A�o bisiesto
			 
			 if (mes == 2) {
				 
				 //febrero en a�o bisiesto
				 
				 do {System.out.println("Ingrese el dia (entre 1 y 29): ");
				 dia = teclado.nextInt(); 
				 if (dia >= 1 && dia <= 29) {
				 
				} else {System.out.println("El dia ingresado es inv�lido.");
				}
				} while (dia < 1 || dia > 29);
				
			}
			 
			 //meses de 30 d�as
			 
			 else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				 
				 do {System.out.println("Ingrese el dia (entre 1 y 30): ");
				 dia = teclado.nextInt(); 
				 if (dia >= 1 && dia <= 30) {
				 
				} else {System.out.println("El dia ingresado es inv�lido.");
				}
				} while (dia < 1 || dia > 30); 
				
			}
		
			 //meses de 31 d�as
			 
			 else {
				
				 do {System.out.println("Ingrese el dia (entre 1 y 31): ");
				 dia = teclado.nextInt(); 
				 if (dia >= 1 && dia <= 31) {
				 
				} else {System.out.println("El dia ingresado es inv�lido.");
				}
				} while (dia < 1 || dia > 31);
			}
			 
			 //FIN A�O BISIESTO RESUELTO
			 
		} else {
			
 if (mes == 2) {
				 
				 //febrero en a�o normal
				 
				 do {System.out.println("Ingrese el dia (entre 1 y 28): ");
				 dia = teclado.nextInt(); 
				 if (dia >= 1 && dia <= 28) {
				 
				} else {System.out.println("El dia ingresado es inv�lido.");
				}
				} while (dia < 1 || dia > 28);
				
			}
			 
			 //meses de 30 d�as
			 
			 else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				 
				 do {System.out.println("Ingrese el dia (entre 1 y 30): ");
				 dia = teclado.nextInt(); 
				 if (dia >= 1 && dia <= 30) {
				 
				} else {System.out.println("El dia ingresado es inv�lido.");
				}
				} while (dia < 1 || dia > 30); 
				
			}
		
			 //meses de 31 d�as
			 
			 else {
				
				 do {System.out.println("Ingrese el dia (entre 1 y 31): ");
				 dia = teclado.nextInt(); 
				 if (dia >= 1 && dia <= 31) {
				 
				} else {System.out.println("El dia ingresado es inv�lido.");
				}
				} while (dia < 1 || dia > 31);
			}
		}
		 
		 System.out.println("la fecha ingresada es: " + dia + "/" + mes + "/" + a�o);
		 
		 teclado.close();
		
	}

}



		
	


