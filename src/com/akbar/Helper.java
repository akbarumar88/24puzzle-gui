package com.akbar;

import java.util.ArrayList;
import java.util.List;

public class Helper {

    public static List<Node> sortByFn(List<Node> list) {
        List<Node> newList = new ArrayList<Node>(list);
        // Mengurutkan dengan algoritma selection sort
        for (int i = 0; i < newList.size() - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < newList.size(); j++) {
                Node currentNode = newList.get(j);
                Node minIdxNode = newList.get(minIdx);
                if (currentNode.getScore() < minIdxNode.getScore()) {
                    minIdx = j;
                }
            }

            // Swap Values
            Node temp = newList.get(i);
            newList.set(i, newList.get(minIdx));
            newList.set(minIdx, temp);
        }

        return newList;
    }

    /**
     * @param successor Node successor
     * @param closed    Daftar Node yang sudah dikunjungi
     * @return Boolean, apakah state node saat ini sudah pernah dikunjungi?
     */
    public static boolean hasBeenVisited(Node successor, List<Node> closed) {
        for (Node closedNode : closed) {
            if (closedNode.getState().toString().equals(successor.getState().toString())) {
                // Jika sama, maka state sudah pernah dikunjungi.
                return true;
            }
        }
        return false;
    }
}
