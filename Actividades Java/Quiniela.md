# Actividad Java - _Quiniela_

Realizar un programa que muestre todas las combinaciones posibles (hasta 14 caracteres) de 1, X, y 2.

Debemos aplicar unas restricciones y solo debe mostrar aquellas combinaciones en que:

- (1 > 5) y (1 < 11)
- (X > 2) y (X < 6)
- (2 > 3) y (2 < 9)


Este es el código realizado en Java:

```java
public class Quiniela {
	public static void main (String[] args) {
		
		int cont=0, conta1=0, contaX=0, conta2=0;
		String resultado="";
		
		for (int a = 1; a < 4; a++) {
		for (int b = 1; b < 4; b++) {
		for (int c = 1; c < 4; c++) {
		for (int d = 1; d < 4; d++) {
		for (int e = 1; e < 4; e++) {
		for (int f = 1; f < 4; f++) {
		for (int g = 1; g < 4; g++) {
		for (int h = 1; h < 4; h++) {
		for (int i = 1; i < 4; i++) {
		for (int j = 1; j < 4; j++) {
		for (int k = 1; k < 4; k++) {
		for (int l = 1; l < 4; l++) {
		for (int m = 1; m < 4; m++) {
		for (int n = 1; n < 4; n++) {
		
		resultado += a + "" + b + "" + c + "" + d + "" + e + "" + f + "" + g + "" + h + "" + i + "" + j
		+ "" + k + "" + l + "" + m +"" + n;
		resultado = resultado.replace('2', 'X');
		resultado = resultado.replace('3', '2');
		
		for (int p = 0; p < resultado.length(); p++) {
			char letra = resultado.charAt(p);
			switch(letra) {
			case '1':
				conta1++;
				break;
			case 'X':
				contaX++;
				break;
			case '2':
				conta2++;
				break;
			}
		}
		
		//Aplicamos las restricciones
		if(((conta1>5)&&(conta1<11))&&((contaX>2)&&(contaX<6))&&((conta2>3)&&(conta2<9))) {
			cont++;
			System.out.println((resultado)+" Linea: "+cont);
		}
		
		resultado="";
		conta1=0;
		contaX=0;
		conta2=0;
		}}}}}}}}}}}}}}
	}
}
```
