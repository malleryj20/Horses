package com.horse;

public class Horse {
    private String name;

    public Horse(String tempname){
        name = tempname;
    }

    public String getname(){
        return name;
    }

    public void setname(String tempname){
        name = tempname;
    }

    public String toString(){
        return (name);
    }

    public boolean equals (Object x) {
        if (x instanceof Horse){
            Horse g = (Horse)x;
            if (name == g.getname())
                return true;
            else
                return false;
        }
        else
            return false;
    }

}