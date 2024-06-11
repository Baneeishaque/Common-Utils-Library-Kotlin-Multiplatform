package common.utils.library.utils

import korlibs.time.DateFormat
import korlibs.time.PatternDateFormat
import kotlin.jvm.JvmStatic

object DateTimeUtils {

    const val normalDateTimePatternAsText = "dd/MM/yyyy HH:mm:ss"

    @JvmStatic
    val normalDatePattern: PatternDateFormat = DateFormat(pattern = "dd/MM/yyyy")
}
