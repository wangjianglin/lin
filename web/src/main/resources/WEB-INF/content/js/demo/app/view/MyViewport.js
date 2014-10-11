/*
 * File: app/view/MyViewport.js
 *
 * This file was generated by Sencha Architect version 2.0.0.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 4.0.x library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 4.0.x. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('MyApp.view.MyViewport', {
    extend: 'Ext.container.Viewport',

    layout: {
        type: 'border'
    },

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'panel',
                    height: 72,
                    padding: 0,
                    layout: {
                        align: 'stretch',
                        padding: 0,
                        type: 'hbox'
                    },
                    bodyPadding: 0,
                    region: 'north',
                    dockedItems: [
                        {
                            xtype: 'image',
                            height: 201,
                            width: 201,
                            src: 'images/logo.png',
                            dock: 'left'
                        },
                        {
                            xtype: 'label',
                            height: 73,
                            html: '<h1>演示</h1>',
                            padding: '40 auto 20 30',
                            text: '',
                            flex: 1,
                            dock: 'top',
                            weight: 10
                        }
                    ]
                },
                {
                    xtype: 'tabpanel',
                    itemId: 'tabPanel',
                    activeTab: 0,
                    region: 'center'
                },
                {
                    xtype: 'panel',
                    itemId: 'navi',
                    width: 163,
                    bodyPadding: 20,
                    title: '菜单',
                    region: 'west',
                    split: true,
                    items: [
                        {
                            xtype: 'button',
                            height: 79,
                            itemId: 'btnAdd',
                            margin: 5,
                            width: 97,
                            enableToggle: true,
                            iconAlign: 'top',
                            iconCls: 'add',
                            pressed: false,
                            scale: 'large',
                            text: '表单',
                            toggleGroup: 'menu'
                        },
                        {
                            xtype: 'button',
                            height: 80,
                            itemId: 'btnHistory',
                            margin: 5,
                            width: 96,
                            enableToggle: true,
                            iconAlign: 'top',
                            iconCls: 'historyQuery',
                            scale: 'large',
                            text: '表格',
                            toggleGroup: 'menu'
                        },
                        {
                            xtype: 'button',
                            height: 87,
                            itemId: 'btnTrend',
                            margin: 5,
                            width: 98,
                            enableToggle: true,
                            iconAlign: 'top',
                            iconCls: 'trendChart',
                            scale: 'large',
                            text: '图标',
                            toggleGroup: 'menu'
                        }
                    ]
                }
            ]
        });

        me.callParent(arguments);
    }

});