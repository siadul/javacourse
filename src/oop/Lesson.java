package oop;

import java.util.Arrays;

public class Lesson {
    Someone someone[] = new Someone[5];
    int counter = 0;

    public void addParticipant(Someone someone) {
        this.someone[counter++] = someone;
    }

    public void showParticipants() {
        System.out.println(
                Arrays.toString(this.someone)
        );

        for(int i=0; i<counter; i++) {
            someone[i].showName(); // !Uwaga
            // polimorfiz (late binding/wielopostaciowość)
        }
    }

}
