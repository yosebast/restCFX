package org.okis.dtos;

public class DataItemDTO {
	
	private String[] metadata;
    private String[][] dataMatrix;

    public String[] getMetadata() {
        return metadata;
    }

    public void setMetadata(String[] metadata) {
        this.metadata = metadata;
    }

    public String[][] getDataMatrix() {
        return dataMatrix;
    }

    public void setDataMatrix(String[][] dataMatrix) {
        this.dataMatrix = dataMatrix;
    }

    void setEmptyToNull() {
        if (metadata != null) {
            for (int i = 0; i < metadata.length; i++) {
                if (metadata[i] != null && metadata[i].isEmpty()) {
                    metadata[i] = null;
                }
            }
        }
        if (dataMatrix != null) {
            for (int i = 0; i < dataMatrix.length; i++) {
                for (int j = 0; j < dataMatrix[i].length; i++) {
                    if (dataMatrix[i][j] != null && dataMatrix[i][j].isEmpty()) {
                        dataMatrix[i][j] = null;
                    }
                }
            }
        }
    }


}
