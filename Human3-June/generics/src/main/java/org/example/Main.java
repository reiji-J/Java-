package org.example;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {

        Pair<String, Integer> p = new Pair<>("hello", 100);


        // ここの出力値の理屈がわからない
        //System.out の仕様かもしれない
        System.out.println(p);

        // これだったらわかる
        System.out.println(p.toString());
    }
}