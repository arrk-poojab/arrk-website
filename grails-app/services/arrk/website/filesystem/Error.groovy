package arrk.website.filesystem

public enum Error {
	CONFIG_NOT_SPECIFIED("error.missing.base.filepath", "Configuration not specified"),
	FILEPATH_NOT_SPECIFIED ("error.missing.filepath", "File path not specified"),
	INSUFFICIENT_FILES ("error.insufficient.files", "Insufficient files in the specified directory"),
	ILLEGALARGUMENT ("error.illegalArgument", "Illegal Argument")
	
	private final String errorKey
	private final String message
  
	private Error(String errorKey, String message) {
		this.errorKey = errorKey
		this.message = message
	}
	
	
	public String getErrorKey() { return errorKey; }  
    public String getMessage() { return message; }
	
}