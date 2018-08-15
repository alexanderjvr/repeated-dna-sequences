package com.vonrobke.dna_sequence;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class RepeatedDnaSequence {
    /**
     * Finds all the N-letter-long repeated sequences in a DNA molecule
     * @param s the dna for sequencing
     * @param seqLen the length sequences to search
     * @return a list of repeated sequences
     */
        public List<String> findRepeatedDnaSequences(String s, int seqLen) {
            // A set of all the repeated sequences
            Set<String> sequences = new HashSet<>();
            // A set of all unique sub sequences
            Set<String> seqBank = new HashSet<>();
            int beginIndex = 0, endIndex = seqLen, len = s.length();
            String subSeq;

            while (endIndex <= len){
                subSeq = s.substring(beginIndex, endIndex);
                // If seqBank already contains the subSeq then add subSeq to sequences list
                if (!seqBank.add(subSeq)){
                    sequences.add(subSeq);
                }
                beginIndex++;
                endIndex++;
            }

            return new ArrayList<>(sequences);
        }

    /**
     * Finds all the 10-letter-long repeated sequences in a DNA molecule
     * @param s the dna for sequencing
     * @return a list of repeated sequences
     */
        public List<String> findRepeatedDnaSequences(String s){
            return this.findRepeatedDnaSequences(s, 10);
        }
    }
