## This is needed because this package will pull via cmake external project
#  and we cannot download any longer during configure stage so we add
#  the artifacts here and put them where cmake expects them

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://ef7dfbf553288064347d51b8ac335f1ca489032a.zip;unpack=0 \
    file://8f65a8734d77c3cc00d74c0532efca872931d3ce.zip;unpack=0 \
"

do_configure:prepend() {
    mkdir ${B}/download
    cp ${WORKDIR}/*.zip ${B}/download
}
