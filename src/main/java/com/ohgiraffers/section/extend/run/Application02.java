package com.ohgiraffers.section.extend.run;

import com.ohgiraffers.section.extend.*;

public class Application02 {

    public static void main(String[] args) {

        /* 목표 와일드카드에 대해 이해할 수 있다. */
        /* 필기
            와일드카드(WildCard)
            제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 떄,
            그 객체의 타입 변수를 제한할 수 있다.
            <?> : 제한 없음
            <? extends Type> : 와일드카드 상한제한(Type 과 Type 의 후손을 이용해 생성한 인스턴스만가능
            <? super Type> : 와일드카드 하한제한(Type 과 Type 의 부모을 이용해 생성한 인스턴스만가능
         */

        WildCardFarm wildCardFarm = new WildCardFarm();

//        WildCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal()));
//        WildCardFarm.anyType(new RabbitFarm<Reptile>(new Reptile()));

        /* 필기 어떠한 토끼농장이던 상관없이 매개변수로 사용 가능 */
        wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        /* 필기 Bunny 이거나 Bunny 의 후손들만 매개변수로 사용 가능하다. */
//        wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        /* 필기 Bunny 이거나 Bunny 의 부모들만 매개변수로 사용 가능하다. */
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));



    }
}
