class Deck{
     final int CARD_NUM = 52;
     Card[] cardArr = new Card[CARD_NUM];

     Deck() {
          int i = 0;

          for(int k = Card.KIND_MAX; k > 0; k--)
               for(int n = 0; n < Card.NUM_MAX; n++)
                    cardArr[i++] = new Card(k, n+1); //모든 종류의 카드 만들기
     }
     Card pick(int index) {
          return cardArr[index]; // 카드 뽑기
     }
     Card pick() {
          int index = (int)(Math.random() * CARD_NUM);
          return pick(index);
     }
     void shuffle() { //카드 무작위로 섞기
          for(int i = 0; i < cardArr.length; i++) {
               int r = (int)(Math.random() * CARD_NUM);

               Card temp = cardArr[i];
               cardArr[i] = cardArr[r];
               cardArr[r] = temp;
          }
     }
}

class Card{
     static final int KIND_MAX = 4;
     static final int NUM_MAX = 13;

     static final int SPADE = 4;
     static final int DIAMOND = 3;
     static final int HEART = 2;
     static final int CLOVER = 1;
     int kind;
     int number;

     Card(){
          this(SPADE, 1);
     }
     Card(int kind, int number){
          this.kind = kind;
          this.number = number;
     }
     public String toString() { //println()를 호출하면 자동으로 toString()이 호출된다.
          String[] kinds = {"", "CLOVER", "HEART","DIAMOND", "SPADE"};
          String numbers = "0123456789XJQK";
          return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
     }
}

public class test {
     public static void main(String[] args) {
          Deck d = new Deck(); // 모든 종류 카드 만들기
          Card c = d.pick(0); // SPADE, 1 뽑기
          System.out.println(c);

          d.shuffle(); // 카드 무작위로 섞기
          c = d.pick(0); // 무작위로 섞은 카드 중에 첫번째 뽑기
          System.out.println(c);
     }
}