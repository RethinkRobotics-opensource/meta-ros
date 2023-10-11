

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

def get_patch(d):
    if d.getVar('PV') == "2.10.3":
        return "file://0001-Do-not-strip-binaries-created-with-cmake.patch"
    else:
        return ""

SRC_URI += " \
   ${@get_patch(d)} \
"

