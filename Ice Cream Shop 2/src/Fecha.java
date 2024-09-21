import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Fecha {
	public static final String getFecha() {
		return ( new SimpleDateFormat( "yyyyMMdd_HHmmss" ) ).format( Calendar.getInstance().getTime() );
	}
}
