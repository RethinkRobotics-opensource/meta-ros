FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-Fix-typeguard-error-149.patch \
    file://0001-parse_yml.py-desperate-try-to-fix-with-modern-typegu.patch \
"
