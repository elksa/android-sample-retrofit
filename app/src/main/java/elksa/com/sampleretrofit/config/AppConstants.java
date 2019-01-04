package elksa.com.sampleretrofit.config;

public class AppConstants {
	// General
	public static final int SPLASH_TIMEOUT= 2000;
	public static final boolean LOG = true;
	public static final String LANGUAGE = "language";
	public static final int DURATION_RIPPLE_EFFECT = 80;
	public static final String[] DEFAULT_SEARCH_QUERIES = {
			"programming",
			"php",
			"mysql",
			"android",
			"ios",
			"javascript",
			"java",
			"swift",
			"games",
			"mobile",
			"python",
			"net"
	};
	// Requests
	public static final String IT_EBOOKS_SERVER_URL = "http://it-ebooks-api.info/v1/";
	// Operations
	public static final String OPERATION_GET_BOOKS = "search/";
	public static final String OPERATION_GET_BOOK_DETAILS = "book/";
	// Parameters
	public static final String OPERATION_PARAMETER_PAGE = "/page/";

	public static final String CONTENT_TYPE_APP_JSON = "application/json";
	public static final String HEADER_NAME_ACCEPT = "Accept";


}
