package com.ohgiraffers.section.extend.run;

import com.ohgiraffers.section.extend.*;

public class Application01 {

    public static void main(String[] args) {

        /* 목표. extends 키워드를 이용하여 특정 타입만 사용하도록 범위 제한 */
        /* 필기.
            제너릭 클래스 작성 시 extends 키워드를 사용하면
            특정 타입만 사용하도록 제한을 걸 수 있다.
            토끼의 후손이거나 토끼인 경우에만 사용이 가능하다.
         */
//        RabbitFarm<Animal> fram1 = new RabbitFarm<Animal>();  // 토끼의 부모
//        RabbitFarm<Mammal> far2 =new RabbitFarm<Mammal>();
//        RabbitFarm<Snake> farm3 = new RabbitFarm<Snake>();

        /* 필기 토끼 타입이거나 그의 후손이면 가능하다  */
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<Rabbit>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<Bunny>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<DrunkenBunny>();
        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry();

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();


    }
}
