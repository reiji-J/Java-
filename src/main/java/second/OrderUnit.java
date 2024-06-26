package second;

import java.util.ArrayList;
import java.util.List;

public class OrderUnit {
    //インスタンス化時に、時刻取得

    private String employeeName;
    private int tableNum;
    private int guestCnt;
    List<OrderLine> OrderLines = new ArrayList<OrderLine>();

    //コンストラクタ
    public OrderUnit(String employeeName, int tableNum, int guestCnt){
        this.employeeName = employeeName;
        this.tableNum = tableNum;
        this.guestCnt = guestCnt;
    }

    //注文完了でtrue
    boolean addOrder(String menu,int cnt){
        OrderLine addOrder = new OrderLine(menu, cnt, (getPrice(menu) * cnt) );
        int succeseAdd = OrderLines.add(addOrder);

        if (succeseAdd != 0 || succceseAdd != null){
            return true;
        }else{
            return false;
        }
    }

    //menu の在庫数を確認 -> 実際どうやって管理するの？
    int confirmStock(String menu){
    }

    //menuを削除した件数をリターン
    //cancelOrder(menu,2) で1個しか注文されていない場合 -> return 1 で１件削除
    int cancelOrder(String menu,int cnt){

    }

    //合計金額（税抜）をリターン
    int getSumPrice(){

    }

    //税込合計金額
    int getSumPriceWithTax () {

    }

    //商品の金額をリターン
    int priceMenu () {

    }
}
