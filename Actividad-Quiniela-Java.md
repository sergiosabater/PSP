# Actividad Quiniela Java
Este es el código realizdo en Java:

```java
public class Quiniela2 {
	public static void main (String[] args) {
		
		int cont=0, conta1=0, contaX=0, conta2=0;
		
		String resultado="";
		
		for (int a = 1; a < 4; a++) {
			for (int b= 1; b < 4; b++) {
				for (int c = 1; c < 4; c++) {
					for (int d= 1; d < 4; d++) {
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
																cont++;
																resultado = resultado + a + "" + b + "" + c + "" + d + "" + e + "" + f + "" + g + "" + h + "" + i + "" + j + "" + k + "" + l + "" + m +"" + n;
																resultado = resultado.replace('2', 'X');
																resultado = resultado.replace('3', '2');
																System.out.println(resultado);
																resultado="";
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
```
