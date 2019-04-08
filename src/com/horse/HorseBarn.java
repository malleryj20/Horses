package com.horse;

public class HorseBarn {
    private Horse [] horses;

    public HorseBarn(Horse [] temphorses){
        horses = temphorses;
    }

    public Horse [] getHorses(){
        return horses;
    }

    public void sethorses(Horse [] temphorses){
        horses = temphorses;
    }

    public HorseBarn setHorse(int index, String name){
        horses[index].setname(name);
        return this;
    }

    public Horse getHorse(int N){
        return horses[N];
    }

    public String toString(){
        String g = "";
        for (int i = 0; i < horses.length; i++)
            g += horses[i].toString() + " ";
        return (g);
    }

    public int findHorseSpace(String name){
        int ret = -1;
        for (int i = 0; i < horses.length; i++){
            if (horses[i] != null)
                if (horses[i].toString().equals(name))
                    ret = i;
        }
        return ret;
    }

    public int getNumHorses(){
        int ret = 0;
        for (int i = 0; i < horses.length; i++) {
            if (horses[i] != null)
                ret++;
        }
        return ret;
    }

    public boolean equals (Object x) {
        if (x instanceof HorseBarn){
            HorseBarn g = (HorseBarn)x;
            if (horses == g.getHorses())
                return true;
            else
                return false;
        }
        else
            return false;
    }

}