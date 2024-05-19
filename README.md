une piece permet déplacer et objet physique...
SeDeplacer : n cases vers x;y;-x;-y
position : x et y
ETAT_vie : boolean
rules : les regles de déplacement des pieces du jeu 

"un click détecté" sur une coordonnée (check si piece présente [ETAT_vie true?] )
	si false pass le program
	si true alors (enregistre les coordonnées et attend le deuxieme click)

"deuxieme click détecté" (check si piece présente [ETAT_vie true?])
    si false pass le program
    si true (regarde l'ETAT_SeDeplacer [don't break the rules?] //appliquer les règles des pièces 
        si false alors pass le program "physiquement impossible"
        si true "physiquement possible" donc appliquer l'ETAT_SeDeplacer)


chessboard: cases avec un etat, list


class : joueur blanc et noir 