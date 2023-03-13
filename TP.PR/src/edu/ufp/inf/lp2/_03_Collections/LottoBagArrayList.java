package edu.ufp.inf.lp2._03_Collections;

import java.util.ArrayList;
import java.util.Random;

public class LottoBagArrayList {
    public static final int MIN_NUM = 1;        // static -> atributos partilhados por todas as instâncias // final -> os valores não mudam (equivalente às "macros"/ contst em C)
    public static final int MAX_NUM = 90;
    private ArrayList<Integer> bagInts = new ArrayList<>();
    private final Random rand = new Random();

    public LottoBagArrayList(){         // CONSTRUTOR
        rand.setSeed(System.currentTimeMillis());
        for (int i = 1; i <= MAX_NUM; i++){
            while(!this.addLottoNumber(rand.nextInt(MAX_NUM)+MIN_NUM))continue;     //retorna um boolean , TRUE se conseguir adicionar um número, FALSE se o número for repetido (se já lá exisitir
        }   // (!...) , enquanto retornar falso
    }

    public boolean addLottoNumber(int n) {
        if(!this.bagInts.contains(n)){      // contains -> verifica se o valor já existe na arraylist
            this.bagInts.add(n);
            return true;
        }
        return false;
    }

    public int numberRemainingBalls(){
        return this.bagInts.size();     //o size retorna o nº de elementos preenchidos no arraylist
    }
    public int[] toIntArray(){      //vai ao bag de inteiros e cria um array estático com todos os elementos dentro do arraylist de inteiros
        int[] arrayInts = new int[this.bagInts.size()];
        for (int i = 0; i < arrayInts.length; i++){
            arrayInts[i] = this.bagInts.get(i);
        }
        return arrayInts;
    }

    public int removeLottoNumberAtIndex(int index){
        if (index >= 0 && index < numberRemainingBalls()){
            return bagInts.remove(index);
        }
        return -1;
    }

    public int removeLottoNumberRandomly(){
        int index = rand.nextInt(numberRemainingBalls()); // número random entre numero de bolas existentes
        return removeLottoNumberAtIndex(index);
    }

    public static void main(String args[]){
        LottoBagArrayList lotto = new LottoBagArrayList();
        while(lotto.numberRemainingBalls() > 0){
            System.out.println(lotto.removeLottoNumberRandomly());
        }

    }
    @Override
    public String toString() {
        return "LottoBagArrayList{" +
                "bagInts=" + bagInts +
                ", rand=" + rand +
                '}';
    }
}
