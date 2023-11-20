FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-CMakeLists.txt-fixing-TMPDIR-inject-Eigen3.patch \
"

# this fixes
# 'generate_parameter_library_cpp_BIN' must not be empty
#
DEPENDS:append = " \
    generate-parameter-library-py-native \
"
