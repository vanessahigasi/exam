package tech.bts.counters.service;

import org.springframework.stereotype.Service;

@Service
public class CounterService {

    private int value;
    private int id;

    public CounterService() {
        this.value = 0;
    }

    public CounterService(int id) {
        this.id = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getId() {
        return id = 0;
    }

    public int nextId() {
        return id++;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int icrement() {
        return value++;
    }


}

