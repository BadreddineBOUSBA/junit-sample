package org.junit;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User{


    private String nom;
    private String prenom;
    private List<String> loisirs;



}
