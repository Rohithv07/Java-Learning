package com.rohith.chainofresponsibility;

/*
 * Concrete handler checks the if the able to handle the file by checking the file type, otherwise forwards to the next handler in the chain.
 */
public class File {
	private final String fileName;
	private final String fileType; // this is used by the handler to check if the file can be handled or not.
	private final String filePath;

	public File(String fileName, String fileType, String filePath) {
		this.fileName = fileName;
		this.fileType = fileType;
		this.filePath = filePath;
	}

	public String getFileName() {
		return fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public String getFilePath() {
		return filePath;
	}

}
