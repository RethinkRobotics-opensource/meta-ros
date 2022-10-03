EXTRA_OECMAKE:append = " \
    -Dzstd_ROOT_DIR=${STAGING_DIR_TARGET}/usr \
"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
# Patch upstream pending
SRC_URI:append = " \
    file://0001-CMakeLists.txt-fixing-detection-of-system-zstd.patch \
"