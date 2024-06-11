package common.utils.library.constants

object ConstantsCommonNative {

    //    TODO : Control width via function parameter
    const val dashedLineSeparator: String = "---------------------------------------------------"
    const val notImplementedMessage = "Not Implemented Yet..."

    //Needs entire match
    const val railwayTimeRegexPattern: String = "(((2[0-3]|[01]?[0-9])(:[0-5][0-9]?(:[0-5][0-9]?)?)?)?)"

    const val digitIncrementOrDecrementRegexPattern: String = "(\\d+)?([-+])"

    const val defaultTimeResetHour = 9
    const val defaultTimeResetMinute = 0
    const val defaultTimeResetSecond = 0

    const val DATA_CONFIRMATION_ERROR_TEXT = "Data Confirmation Error"
    const val USER_CANCELLED_TEXT = "User Cancelled"
}
