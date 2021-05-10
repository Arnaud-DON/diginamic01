package fr.diginamic.maison;

public class Maison {
    Piece[] pieces = new Piece[0];

    public void ajouterPiece(Piece piece){
        if(piece != null) {

            int currentSize = this.pieces.length;
            Piece[] newPieces = new Piece[currentSize + 1];
            newPieces[currentSize] = piece;

            for (int i = 0; i < currentSize; i++) {
                newPieces[i] = this.pieces[i];
            }

            this.pieces = newPieces;
        }
        else {
            System.out.println("Maison.ajouterPiece(Piece) - Cannot add null object.");
        }
    }

    public double totalSurface(){
        double result = 0;
        for (Piece piece : this.pieces) {
            result += piece.surface;
        }

        return result;
    }

    public double floorSurface(int floor){
        double result = 0;
        for (Piece piece : this.pieces) {
            if(piece.floor == floor){
                result += piece.surface;
            }
        }

        return result;
    }

    public double roomsSurface(Class<? extends Piece> roomType) {
        double result = 0;

        for (Piece piece : this.pieces) {
            if(roomType.isInstance(piece)){
                result += piece.surface;
            }
        }

        return result;
    }

    public int numberOfRoom(Class<? extends Piece> roomType){
        int result = 0;

        for (Piece piece : this.pieces) {
            if(roomType.isInstance(piece)){
                result ++;
            }
        }

        return result;
    }
}
