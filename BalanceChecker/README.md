
# Balance Checker

## Descripción

Este desafío consiste en implementar una función en Java que verifique si una cadena que contiene paréntesis `()`, corchetes `[]` y llaves `{}` está balanceada correctamente.

## Ejemplo

```java
public class BalanceChecker {
    public static void main(String[] args) {
        String balancedExpression = "{[()]()}";
        String unbalancedExpression = "{[(])}";

        System.out.println("Balanceado: " + isBalanced(balancedExpression));  // Debería imprimir true
        System.out.println("Balanceado: " + isBalanced(unbalancedExpression));  // Debería imprimir false
    }

    public static boolean isBalanced(String expression) {
        // Implementa la lógica para verificar el balanceo de paréntesis, corchetes y llaves
        // Devuelve true si está balanceado, false de lo contrario
    }
}
```

## Consideraciones

- Los paréntesis, corchetes y llaves deben cerrarse en el orden correcto para que la expresión sea considerada balanceada.
- Puedes asumir que la cadena solo contendrá paréntesis, corchetes y llaves, sin otros caracteres.
- La función debe manejar correctamente las expresiones vacías y debe funcionar para expresiones de cualquier longitud.

## Puntos Extra

- Caracteres Adicionales: Extiende la función para manejar correctamente expresiones que contienen otros caracteres (ignorándolos).
- Estructura de Pila: Implementa la función utilizando una estructura de datos de pila para rastrear la apertura y cierre de paréntesis, corchetes y llaves.
- Eficiencia: Asegúrate de que la función sea eficiente y maneje expresiones de gran tamaño de manera efectiva.