DEPENDS:append = " \
    generate-parameter-library-py-native \
"

# fix for QA Issue [dev-so]

FILES:${PN}-dev += " \
    /usr/lib/*.so \
"