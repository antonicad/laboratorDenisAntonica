package Laborator6;


import java.util.*;

public class Shows {
    public static void main(String[] args)
    {
        Show[] shows = {
                new Show(12.3, 16.3),
                new Show(15.0, 18.0),
                new Show(10.0, 18.3),
                new Show(18.0, 20.45),
                new Show(12.15, 13.0)
        };

        List<Show> toSee = getShowsToSee(shows);

        for (Show i: toSee) {
            System.out.println("Start: " + i.start + ". End: " + i.end);
        }
    }

    private static List<Show> getShowsToSee(Show[] shows)
    {
        sort(shows);

        List<Show> toSee = new ArrayList<Show>();
        toSee.add(shows[0]);

        for (int i = 1; i< shows.length; i++) {
            if (shows[i].start >= toSee.get(toSee.size() -1).end) {
                toSee.add(shows[i]);
            }
        }

        return toSee;

    }

    private static void sort(Show[] shows) {
        int n = shows.length;
        boolean swap;
        for (int i = 0; i < n; i++) {
            swap = false;
            for (int j = 0; j < n-i-1; j++) {
                if(shows[j+1].end < shows[j].end ) {
                    Show temp = shows[j];
                    shows[j] = shows[j+1];
                    shows[j+1] = temp;
                    swap = true;
                }
            }
            if (swap == false) {
                break;
            }
        }
    }

    static class Show {
        double start; double end;

        public Show(double start, double end)
        {
            this.start = start;
            this.end = end;
        }
    }
}
