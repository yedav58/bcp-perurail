package PeruRail.model;

public class MontosBoletoModel {

    public static String get_montoTotalEnProcesoUSD() {
        return _montoTotalEnProcesoUSD;
    }
    public static void set_montoTotalEnProcesoUSD(String _montoTotalEnProcesoUSD) {
        MontosBoletoModel._montoTotalEnProcesoUSD = _montoTotalEnProcesoUSD;
    }
    public static String get_montoTotalEnResumenUSD() {
        return _montoTotalEnResumenUSD;
    }
    public static void set_montoTotalEnResumenUSD(String _montoTotalEnResumenUSD) {
        MontosBoletoModel._montoTotalEnResumenUSD = _montoTotalEnResumenUSD;
    }

    private static String _montoTotalEnProcesoUSD;
    private static String _montoTotalEnResumenUSD;

}
