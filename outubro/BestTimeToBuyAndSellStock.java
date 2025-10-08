package outubro;

/**
 * Você recebe uma matriz pricesonde prices[i]está o preço de uma determinada ação no dia.ith
 *
 * Você quer maximizar seu lucro escolhendo um único dia para comprar uma ação e escolhendo um dia diferente no futuro para vendê-la.
 *
 * Retorne o lucro máximo que você conseguir com esta transação . Se não conseguir lucro algum, devolva 0.
 *
 *
 *
 * Exemplo 1:
 *
 * Entrada: preços = [7,1,5,3,6,4]
 *  Saída: 5
 *  Explicação: Compre no dia 2 (preço = 1) e venda no dia 5 (preço = 6), lucro = 6-1 = 5.
 * Observe que comprar no dia 2 e vender no dia 1 não é permitido porque você deve comprar antes de vender.
 * Exemplo 2:
 *
 * Entrada: preços = [7,6,4,3,1]
 *  Saída: 0
 *  Explicação: Neste caso, nenhuma transação é feita e o lucro máximo = 0.
 */
public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices){
        int min = prices[0];
        int lucroMaximo = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                int lucro = prices[i] - min;
                if (lucro > lucroMaximo) {
                    lucroMaximo = lucro;
                }
            }
        }
        return lucroMaximo;
    }
    public static void main (String [] args){
        System.out.println(maxProfit(new int [] {7,1,5,3,6,4})); //7,1,5,3,6,4 | 7,6,4,3,1
    }
}
