package com.lemzki.tools.people.db.model;

import com.google.common.collect.Sets;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


//This is one way as the other may have a different list
@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Relationship {
    @Id @GeneratedValue
    private Long id;
    @OneToOne
    private Person main;
    @OneToOne
    private Person other;

    @ManyToMany
    private @NonNull Set<RelationType> relation = new HashSet<>();

    public static Relationship of(RelationType... rel){
        Relationship rs = new Relationship();
        rs.setRelation(Sets.newHashSet(rel));
        return rs;
    }




}