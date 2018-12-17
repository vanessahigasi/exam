package tech.bts.counters.service;

import org.springframework.stereotype.Service;

@Service
public class CounterService {

    private int value;

    public CounterService() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int icrement() {
        return value++;
    }
}

