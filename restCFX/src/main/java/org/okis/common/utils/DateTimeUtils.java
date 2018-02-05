package org.okis.common.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.apache.poi.ss.usermodel.DateUtil;
import org.joda.time.Chronology;





public class DateTimeUtils {

	private static final String DEFAULT_DATE_TIME_ZONE = "Etc/UTC";

	private static final int DEFAULT_SPOT_LAG = 0;
	private static DateTimeUtils instance;




	private static final String EXPORT_DATE_FORMAT = "dd/MM/yyyy";

	private static final String EXPORT_EXCEL_DATE_FORMAT = "MM/dd/yyyy";

	private static final String TYPHOON_DATE_FORMAT = "yyyy-MM-dd";

	private static final String EXPORT_DATE_REST_FORMAT = "ddMMyyyy";

	private static final String EXPORT_DATETIME_FORMAT = "dd/MM/yyyy HH:mm:ss";

	private static final String EXPORT_DATETIMEMILLIS_FORMAT = "dd/MM/yyyy HH:mm:ss.SSS";

	private static final String EXPORT_DATE_BUCKET_FORMAT = "dd/MM/yyyy";

	private static final String EXPORT_TYPHOON_FORMAT = "yyyy-MM-ddTHH:mm:ss";


	private static final String TENOR_FORMAT = "MMM yy";

	private static final String FORWARD_DATE_FORMAT = "yyyyMMdd";

	private static final String MDRS_DATE_FORMAT = "yyyyMMdd";

	private static final String PAST_DATE_FORMAT = "yyyyMMddHHmmss";
	

	
	//days convetion
	private static final int ON = 0;
	private static final int TN = 1;
	private static final int SPOT = 2;
	private static final int WEEK = 7;


	
}

