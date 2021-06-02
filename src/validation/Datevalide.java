package validation;

public class Datevalide {
private int jour,mois,an;

public int getJour() {
	return jour;
}

public void setJour(int jour) {
	this.jour = jour;
}

public int getMois() {
	return mois;
}

public void setMois(int mois) {
	this.mois = mois;
}

public int getAn() {
	return an;
}

public void setAn(int an) {
	this.an = an;
}

@Override
public String toString() {
	return "Datevalide [jour=" + jour + ", mois=" + mois + ", an=" + an + "]";
}





}
